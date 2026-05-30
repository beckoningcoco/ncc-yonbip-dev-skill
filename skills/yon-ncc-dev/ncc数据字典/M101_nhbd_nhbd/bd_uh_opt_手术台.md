# |<<

**手术台 (bd_uh_opt / nc.vo.nhbd.res.opttbl.OptTbl)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1060.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_opt | 手术台主键 | pk_opt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 手术台编码 | code | varchar(30) |  | 字符串 (String) |
| 5 | name | 手术台名称 | name | varchar(50) |  | 字符串 (String) |
| 6 | pk_opttype | 手术台类型主键 | pk_opttype | varchar(20) |  | 手术台类型(自定义档案) (Defdoc-010500) |
| 7 | dt_opttype | 手术台类型编码 | dt_opttype | varchar(50) |  | 字符串 (String) |
| 8 | pk_dept | 所属科室 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 9 | mnecode | 输入码 | mnecode | varchar(30) |  | 字符串 (String) |
| 10 | flag_stop | 停用标志 | flag_stop | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | flag_ocupy | 占用标识 | flag_ocupy | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_pati | 患者编码 | pk_pati | varchar(50) |  | 字符串 (String) |
| 13 | code_fa | 当前对应设备编码 | code_fa | varchar(30) |  | 字符串 (String) |
| 14 | pk_place | 手术室地点 | pk_place | varchar(20) |  | 位置管理 (uhplace) |
| 15 | name_place | 地址 | name_place | varchar(50) |  | 字符串 (String) |
| 16 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 17 | maketime | 制单时间 | maketime | char(19) | √ | 日期时间 (UFDateTime) |
| 18 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 19 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 20 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 21 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 22 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 23 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |