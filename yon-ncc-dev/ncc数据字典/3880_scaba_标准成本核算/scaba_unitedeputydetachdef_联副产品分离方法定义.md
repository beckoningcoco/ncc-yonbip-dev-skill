# |<<

**联副产品分离方法定义 (scaba_unitedeputydetachdef / nc.vo.scaba.unitedeputydetachdef.entity.UniteDeputyDetachDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5094.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cunitedeputydetachdefid | 联副产品分离方法定义 | cunitedeputydetachdefid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 4 | pk_factory | 工厂 | pk_factory | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_factory_v | 工厂版本 | pk_factory_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 8 | stunitedetach | 标准成本联产品分离方法 | stunitedetach | int |  | 联产品分离方法枚举 (STUniteProDetachEnum) | 3 | 1=不计算; |