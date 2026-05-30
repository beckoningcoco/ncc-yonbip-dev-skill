# |<<

**低值收费单 (hstf_minicharge / nc.vo.hstf.minicharge.MinichargeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2777.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_minicharge | 主键 | pk_minicharge | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 6 | h_areaname | 院区名称 | h_areaname | varchar(50) |  | 字符串 (String) |
| 7 | h_areacode | 院区编码 | h_areacode | varchar(50) |  | 字符串 (String) |
| 8 | patientname | 病人姓名 | patientname | varchar(50) |  | 字符串 (String) |
| 9 | diagnosisnum | 病人病案号 | diagnosisnum | varchar(50) |  | 字符串 (String) |
| 10 | birthday | 出生日期 | birthday | varchar(50) |  | 字符串 (String) |
| 11 | patientgender | 病人性别 | patientgender | varchar(50) |  | 字符串 (String) |
| 12 | bednum | 床号 | bednum | varchar(50) |  | 字符串 (String) |
| 13 | operationcode | 手术代码 | operationcode | varchar(50) |  | 字符串 (String) |
| 14 | operationname | 手术名称 | operationname | varchar(50) |  | 字符串 (String) |
| 15 | operationtime | 手术时间 | operationtime | varchar(50) |  | 字符串 (String) |
| 16 | operationadd | 手术地点 | operationadd | varchar(50) |  | 字符串 (String) |
| 17 | doctorname | 手术医生姓名 | doctorname | varchar(50) |  | 字符串 (String) |
| 18 | doctorcode | 手术医生编码 | doctorcode | varchar(50) |  | 字符串 (String) |
| 19 | billingcode | 开单科室编码 | billingcode | varchar(50) |  | 字符串 (String) |
| 20 | billingname | 开单科室名称 | billingname | varchar(50) |  | 字符串 (String) |
| 21 | executioncode | 执行科室编码 | executioncode | varchar(50) |  | 字符串 (String) |
| 22 | executionname | 执行科室名称 | executionname | varchar(50) |  | 字符串 (String) |
| 23 | cgeneralhid | 出库单主键 | cgeneralhid | varchar(50) |  | 字符串 (String) |
| 24 | vbillcode | 出库单号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 25 | transstatus | 传输状态 | transstatus | varchar(50) |  | 字符串 (String) |
| 26 | message | 消息 | message | varchar(50) |  | 字符串 (String) |
| 27 | syscode | 对接系统编码 | syscode | varchar(50) |  | 字符串 (String) |
| 28 | sysname | 对接系统名 | sysname | varchar(50) |  | 字符串 (String) |
| 29 | sysadd | 对接系统地址 | sysadd | varchar(50) |  | 字符串 (String) |
| 30 | sysaccount | 对接系统账户 | sysaccount | varchar(50) |  | 字符串 (String) |
| 31 | maketime | 制单时间 | maketime | char(19) | √ | 日期时间 (UFDateTime) |
| 32 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 33 | pkorg | 所属组织 | pkorg | varchar(50) |  | 字符串 (String) |
| 34 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 35 | billmaker | 制单人 | billmaker | varchar(50) |  | 字符串 (String) |
| 36 | approver | 审批人 | approver | varchar(50) |  | 字符串 (String) |
| 37 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |