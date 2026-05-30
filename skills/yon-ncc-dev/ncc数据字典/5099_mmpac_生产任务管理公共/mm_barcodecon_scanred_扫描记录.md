# |<<

**扫描记录 (mm_barcodecon_scanred / nc.vo.mmpac.barcodem.barcodeconsole.entity.BarcodeConsoleScanredVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3629.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_barcodecon_scanred | 扫描记录 | pk_barcodecon_scanred | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cbbillhid | 单据表头 | cbbillhid | char(20) |  | 字符串 (String) |
| 6 | cbbillbid | 单据表体 | cbbillbid | char(20) |  | 字符串 (String) |
| 7 | cbbillgid | 单据孙表 | cbbillgid | char(20) |  | 字符串 (String) |
| 8 | cbpickmid | 备料计划表头 | cbpickmid | char(20) |  | 字符串 (String) |
| 9 | cbpickmbid | 备料计划表体 | cbpickmbid | char(20) |  | 字符串 (String) |
| 10 | fbscanbilltype | 扫描单据类型 | fbscanbilltype | int |  | 扫描单据类型 (ScanBillTypeEnum) |  | 1=流程生产订单行; |