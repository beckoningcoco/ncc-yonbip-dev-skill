# |<<

**协同现金流量设置 (gl_reconcilecf / nc.vo.gl.reconcilemodule.reconcilecf)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2454.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcilecf | 现金流量标识 | pk_reconcilecf | char(20) | √ | 主键 (UFID) |
| 2 | pk_glorgbook | 主体账簿 | pk_glorgbook | char(20) |  | 主键 (UFID) |
| 3 | pk_cashflow | 现金流量表项 | pk_cashflow | char(20) |  | 主键 (UFID) |
| 4 | scale | 比例 | scale | decimal(20, 4) |  | 数值 (UFDouble) |