# |<<

**投放计划 (mm_putplan / nc.vo.mmpac.putplan.entity.PutPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3755.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_putplan | 投放计划 | pk_putplan | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 4 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | vbillcode | 投放计划单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | cbilltype | 单据类型 | cbilltype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 8 | fbillstatus | 状态 | fbillstatus | int |  | 投放计划状态 (PutPlanBillStatus) |  | 1=自由; |