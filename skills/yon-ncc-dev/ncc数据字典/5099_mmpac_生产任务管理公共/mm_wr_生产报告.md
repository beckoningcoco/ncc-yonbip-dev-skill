# |<<

**生产报告 (mm_wr / nc.vo.mmpac.wr.entity.WrVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3795.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wr | 生产报告 | pk_wr | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | vbillcode | 生产报告单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | fbillstatus | 报告状态 | fbillstatus | int |  | 生产报告单据状态 (BillStatusEnum) |  | 1=自由; |