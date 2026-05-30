# |<<

**备料计划统计 (mm_pickmquery / nc.vo.mmpac.pickm.pickms.entity.PickmQueryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3724.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpickmid | 备料计划单 | cpickmid | char(20) | √ | 主键 (UFID) |
| 2 | vbillcode | 备料计划单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | vbusitypeid | 备料类型 | vbusitypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | fsourcetype | 备料计划来源 | fsourcetype | int |  | 来源单据类型 (FsourcetypeEnum) |  | 0=生产订单; |