package cf.naechelin.dao;

import cf.naechelin.mapper.CouponMapper;
import cf.naechelin.vo.CouponVO;
import cf.naechelin.vo.QueryVO;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.awt.image.BufferedImage;
import java.util.List;

@Repository("CouponDAO")
public class CouponDAOImpl implements CouponDAO
{
    @Autowired
    public CouponMapper mapper;

    @Override
    public void insert(CouponVO coupon)
    {
        mapper.insert(coupon);
    }

    @Override
    public void delete(int lineId)
    {
        mapper.delete(lineId);
    }

    // 쿠폰을 사용하지 않았고 날짜가 지났을 경우 삭제하는 메소드

    @Override
    public CouponVO view(int lineId)
    {
        return mapper.view(lineId);
    }

    @Override
    public List<CouponVO> list(QueryVO query)
    {
        return mapper.list(query);
    }

    @Override
    public BufferedImage createQR(int lineId)
    {
        BufferedImage bufferedImage = null;
        try
        {
            // 코드인식시 링크걸 URL주소
            String codeurl = new String(toString().getBytes("UTF-8"), "ISO-8859-1");
            // 큐알코드 바코드 생상값
            int qrcodeColor = 0xFF2e4e96;
            // 큐알코드 배경색상값
            int backgroundColor = 0xFFFFFFFF;

            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            // 3,4번째 parameter값 : width/height값 지정
            BitMatrix bitMatrix = qrCodeWriter.encode(codeurl, BarcodeFormat.QR_CODE, 200, 200);
            //
            MatrixToImageConfig matrixToImageConfig = new MatrixToImageConfig(qrcodeColor, backgroundColor);
            bufferedImage = MatrixToImageWriter.toBufferedImage(bitMatrix, matrixToImageConfig);
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return bufferedImage;
    }
}
