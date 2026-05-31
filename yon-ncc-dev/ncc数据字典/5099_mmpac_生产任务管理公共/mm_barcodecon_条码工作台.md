# |<<

**条码工作台 (mm_barcodecon / nc.vo.mmpac.barcodem.barcodeconsole.entity.BarcodeConsoleHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3628.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_barcodecon | 条码工作台 | pk_barcodecon | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cworkman | 员工 | cworkman | varchar(20) |  | 人员基本信息 (psndoc) |
| 6 | cteamid | 班组 | cteamid | varchar(20) |  | 班组定义维护表信息 (bd_team) |
| 7 | cshiftid | 班次 | cshiftid | varchar(20) |  | 班次 (bdshift) |
| 8 | fscanbilltype | 扫描单据类型 | fscanbilltype | int |  | 扫描单据类型 (ScanBillTypeEnum) |  | 1=流程生产订单行; |