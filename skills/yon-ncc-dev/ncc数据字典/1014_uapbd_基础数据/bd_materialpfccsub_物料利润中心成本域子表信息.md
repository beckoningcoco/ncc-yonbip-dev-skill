# |<<

**物料利润中心成本域子表信息 (bd_materialpfccsub / nc.vo.bd.material.pfcc.MaterialPFCCSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/900.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mateprofcost_b | 主键 | pk_mateprofcost_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_liabilitybook | 责任核算账簿 | pk_liabilitybook | varchar(20) | √ | 账簿_责任核算账簿 (liabilitybook) |
| 3 | costmode | 计价方式 | costmode | int |  | 计价方式-利润中心成本域 (profitcostmode) |  | 3=移动平均; |