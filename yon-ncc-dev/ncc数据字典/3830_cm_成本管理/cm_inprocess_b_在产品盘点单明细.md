# |<<

**在产品盘点单明细 (cm_inprocess_b / nc.vo.cm.inprocess.entity.InprocessItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1481.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cinprocess_bid | 在产品盘点单明细 | cinprocess_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cinprocessid | 在产品盘点单 | cinprocessid | char(20) |  | 主键 (UFID) |
| 6 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 7 | nplannum | 计划数量 | nplannum | decimal(20, 8) |  | 数值 (UFDouble) |
| 8 | nfinishnum | 完工数量 | nfinishnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 9 | ninpronum | 在产量 | ninpronum | decimal(20, 8) |  | 数值 (UFDouble) |
| 10 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 11 | istatus | 状态 | istatus | int |  | 单据状态(成本) (CMStatusEnum) | 1 | 1=自由; |