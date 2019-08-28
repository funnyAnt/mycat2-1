package cn.lightfish.sql.ast.expr.arithmeticExpr.bigDecimalOperator;

import cn.lightfish.sql.context.RootSessionContext;
import cn.lightfish.sql.ast.expr.numberExpr.BigDecimalExpr;
import cn.lightfish.sql.ast.expr.ValueExpr;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BigDecimalSignExpr implements BigDecimalExpr {

  private final RootSessionContext context;
  private final ValueExpr valueExpr;

  @Override
  public BigDecimal getValue() {
    BigDecimal value = (BigDecimal) valueExpr.getValue();
    if (value == null){
      return null;
    }
    return value.negate();
  }
}