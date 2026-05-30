# |<<

**价格来源对应关系 (sca_pricesourcerelation / nc.vo.sca.stdcostcalc.PriceSourceRelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5061.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation | 价格来源对应关系 | pk_relation | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 工厂 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_costtypeid | 成本类型 | pk_costtypeid | varchar(50) |  | 字符串 (String) |
| 5 | cmainmaterialid | 成本bom主产品物料id | cmainmaterialid | varchar(50) |  | 字符串 (String) |
| 6 | cstuffmaterialid | 成本bom子项物料id | cstuffmaterialid | varchar(50) |  | 字符串 (String) |
| 7 | cbomstuffid | 成本bom子项主键 | cbomstuffid | varchar(50) |  | 字符串 (String) |