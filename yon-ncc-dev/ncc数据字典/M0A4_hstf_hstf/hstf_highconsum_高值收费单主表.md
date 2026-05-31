# |<<

**高值收费单主表 (hstf_highconsum / nc.vo.hstf.highconsumable.HighConsumVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2759.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_highconsum | 主表主键 | pk_highconsum | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 6 | sourceorgcode | 院区编码 | sourceorgcode | varchar(50) |  | 字符串 (String) |
| 7 | sourceorgname | 院区名称 | sourceorgname | varchar(50) |  | 字符串 (String) |
| 8 | casenumber | 病人病案号 | casenumber | varchar(50) |  | 字符串 (String) |
| 9 | patientname | 病人姓名 | patientname | varchar(50) |  | 字符串 (String) |
| 10 | birthday | 出生日期 | birthday | varchar(50) |  | 字符串 (String) |
| 11 | sex | 性别 | sex | varchar(50) |  | 字符串 (String) |
| 12 | bedno | 病人床号 | bedno | varchar(50) |  | 字符串 (String) |
| 13 | operationcode | 手术代码 | operationcode | varchar(50) |  | 字符串 (String) |
| 14 | operationname | 手术名称 | operationname | varchar(50) |  | 字符串 (String) |
| 15 | operationtime | 手术时间 | operationtime | varchar(50) |  | 字符串 (String) |
| 16 | operationaddress | 手术地点 | operationaddress | varchar(50) |  | 字符串 (String) |
| 17 | doctorcode | 手术医生编码 | doctorcode | varchar(50) |  | 字符串 (String) |
| 18 | doctorname | 手术医生名称 | doctorname | varchar(50) |  | 字符串 (String) |
| 19 | billdeptcode | 开单科室编码 | billdeptcode | varchar(50) |  | 字符串 (String) |
| 20 | billdeptname | 开单科室名称 | billdeptname | varchar(50) |  | 字符串 (String) |
| 21 | excutedeptcode | 执行科室编码 | excutedeptcode | varchar(50) |  | 字符串 (String) |
| 22 | excutedeptname | 执行科室名称 | excutedeptname | varchar(50) |  | 字符串 (String) |
| 23 | cdeptvid | 领料部门主键 | cdeptvid | varchar(50) |  | 字符串 (String) |
| 24 | pk_stordoc | 仓库主键 | pk_stordoc | varchar(50) |  | 字符串 (String) |
| 25 | cgeneralhid | 出库单主键 | cgeneralhid | varchar(50) |  | 字符串 (String) |
| 26 | outbillno | 出库单号 | outbillno | varchar(50) |  | 字符串 (String) |
| 27 | transtatus | 传输状态 | transtatus | varchar(50) |  | 传输状态 (transresult) |  | 1=成功; |