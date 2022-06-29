package cn.itedus.lottery.interfaces.assembler;

import cn.itedus.lottery.domain.strategy.model.vo.DrawAwardVO;
import cn.itedus.lottery.rpc.dto.AwardDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-23T16:28:20+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
@Component
public class AwardMappingImpl implements AwardMapping {

    @Override
    public List<AwardDTO> sourceToTarget(List<DrawAwardVO> var1) {
        if ( var1 == null ) {
            return null;
        }

        List<AwardDTO> list = new ArrayList<AwardDTO>( var1.size() );
        for ( DrawAwardVO drawAwardVO : var1 ) {
            list.add( sourceToTarget( drawAwardVO ) );
        }

        return list;
    }

    @Override
    public List<DrawAwardVO> targetToSource(List<AwardDTO> var1) {
        if ( var1 == null ) {
            return null;
        }

        List<DrawAwardVO> list = new ArrayList<DrawAwardVO>( var1.size() );
        for ( AwardDTO awardDTO : var1 ) {
            list.add( targetToSource( awardDTO ) );
        }

        return list;
    }

    @Override
    public List<AwardDTO> sourceToTarget(Stream<DrawAwardVO> stream) {
        if ( stream == null ) {
            return null;
        }

        return stream.map( drawAwardVO -> sourceToTarget( drawAwardVO ) )
        .collect( Collectors.toCollection( ArrayList<AwardDTO>::new ) );
    }

    @Override
    public List<DrawAwardVO> targetToSource(Stream<AwardDTO> stream) {
        if ( stream == null ) {
            return null;
        }

        return stream.map( awardDTO -> targetToSource( awardDTO ) )
        .collect( Collectors.toCollection( ArrayList<DrawAwardVO>::new ) );
    }

    @Override
    public AwardDTO sourceToTarget(DrawAwardVO var1) {
        if ( var1 == null ) {
            return null;
        }

        String userId = null;

        userId = var1.getuId();

        AwardDTO awardDTO = new AwardDTO( userId );

        awardDTO.setAwardId( var1.getAwardId() );
        awardDTO.setAwardType( var1.getAwardType() );
        awardDTO.setAwardName( var1.getAwardName() );
        awardDTO.setAwardContent( var1.getAwardContent() );
        awardDTO.setStrategyMode( var1.getStrategyMode() );
        awardDTO.setGrantType( var1.getGrantType() );
        awardDTO.setGrantDate( var1.getGrantDate() );

        return awardDTO;
    }

    @Override
    public DrawAwardVO targetToSource(AwardDTO var1) {
        if ( var1 == null ) {
            return null;
        }

        DrawAwardVO drawAwardVO = new DrawAwardVO();

        drawAwardVO.setAwardId( var1.getAwardId() );
        drawAwardVO.setAwardType( var1.getAwardType() );
        drawAwardVO.setAwardName( var1.getAwardName() );
        drawAwardVO.setAwardContent( var1.getAwardContent() );
        drawAwardVO.setStrategyMode( var1.getStrategyMode() );
        drawAwardVO.setGrantType( var1.getGrantType() );
        drawAwardVO.setGrantDate( var1.getGrantDate() );

        return drawAwardVO;
    }
}
