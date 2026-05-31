# |<<

**状态驱动 (pm_wbs_statedrive / nc.vo.ppm.wbs.StatusDriveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4558.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_status_drive | 状态驱动子表主键 | pk_status_drive | char(20) | √ | 主键 (UFID) |
| 2 | bill_type | 驱动单据编码 | bill_type | varchar(50) |  | 字符串 (String) |
| 3 | pk_drive_bill | 驱动单据 | pk_drive_bill | varchar(50) |  | 字符串 (String) |
| 4 | transi_type | 交易类型编码 | transi_type | varchar(50) |  | 字符串 (String) |
| 5 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | pk_drive_status | 驱动状态 | pk_drive_status | int |  | 任务状态 (pmwbsstatus) |  | 1=进行中; |