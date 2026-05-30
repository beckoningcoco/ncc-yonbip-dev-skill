# |<<

**现金流量业务规则对应表 (gl_busrelation / nc.vo.gl.busrule.busrelation)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2358.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busrelation | 规则对应标识 | pk_busrelation | char(20) | √ | 主键 (UFID) |
| 2 | pk_cashflow | 现金流量项 | pk_cashflow | char(20) |  | 主键 (UFID) |
| 3 | pk_busruledetail | 业务规则分录 | pk_busruledetail | char(20) |  | 主键 (UFID) |
| 4 | scale | 比例 | scale | decimal(20, 4) |  | 数值 (UFDouble) |
| 5 | aspect | 流入流出方向 | aspect | int |  | 整数 (Integer) |
| 6 | memo | 备注 | memo | char(20) |  | 主键 (UFID) |
| 7 | pk_accountingbook | 核算账簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 8 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 9 | pk_org | 财务组织 | pk_org | varchar(50) |  | 字符串 (String) |