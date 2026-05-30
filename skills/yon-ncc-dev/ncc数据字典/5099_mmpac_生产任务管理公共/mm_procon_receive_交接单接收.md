# |<<

**交接单接收 (mm_procon_receive / nc.vo.mmpac.proconsole.entity.ProConReceiveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3751.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cid | 交接单明细 | cid | char(20) | √ | 主键 (UFID) |
| 2 | coperheadid | 表头 | coperheadid | varchar(50) |  | 字符串 (String) |
| 3 | choid | 交接单 | choid | varchar(50) |  | 字符串 (String) |
| 4 | chobid | 交接单明细主键 | chobid | varchar(50) |  | 字符串 (String) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 工厂最新 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 7 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 8 | vbillcode | 交接单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 9 | fhobillstatus | 状态 | fhobillstatus | int |  | 交接单状态 (FbillstatusEnum) |  | 1=进行中; |