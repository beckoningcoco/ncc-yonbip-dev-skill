# |<<

**临床路径_基本信息表 (uh_cn_cp / com.yonyou.yh.nhis.cn.cp.vo.CpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5960.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cp | 临床路径主键id | pk_cp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | char(20) | √ | 主键 (UFID) |
| 4 | code_cp | 路径编码 | code_cp | varchar(30) |  | 字符串 (String) |
| 5 | name_cp | 临床路径名称，可以重复 | name_cp | varchar(50) |  | 字符串 (String) |
| 6 | ver_cp | 版本号 | ver_cp | varchar(20) |  | 字符串 (String) |
| 7 | date_ver | 版本日期。新版本创建时候的日期。精确到时分秒 | date_ver | char(19) |  | 日期时间 (UFDateTime) |
| 8 | date_enable | 启用日期。精确到时分秒 | date_enable | char(19) |  | 日期时间 (UFDateTime) |
| 9 | date_stop | 停用日期。精确到时分秒 | date_stop | char(19) |  | 日期时间 (UFDateTime) |
| 10 | date_create | 创建日期。创建这个路径的日期。当前系统的日期. 精确到时分秒 | date_create | char(19) |  | 日期时间 (UFDateTime) |
| 11 | flag_enable | 是否启用:0是1否。未审核的不可启用。 | flag_enable | int |  | 整数 (Integer) |
| 12 | max_day | 路径最大天数。 | max_day | int |  | 整数 (Integer) |
| 13 | max_stage | 路径最大阶段。 | max_stage | int |  | 整数 (Integer) |
| 14 | price | 费用。（元） | price | decimal(8, 2) |  | 数值 (UFDouble) |
| 15 | pk_psn_create | 创建人\版本升级人id | pk_psn_create | char(20) |  | 主键 (UFID) |
| 16 | name_psn_create | 创建人姓名\版本升级人姓名 | name_psn_create | varchar(50) |  | 字符串 (String) |
| 17 | status_cp | 状态（0未审核 1已审核）。 | status_cp | int |  | 整数 (Integer) |
| 18 | pk_psn_audit | 审核人 | pk_psn_audit | char(20) |  | 主键 (UFID) |
| 19 | name_psn_audit | 审核人姓名 | name_psn_audit | varchar(50) |  | 字符串 (String) |
| 20 | date_audit | 审核时间。 | date_audit | char(19) |  | 日期时间 (UFDateTime) |
| 21 | pk_dept | 科室id | pk_dept | char(20) |  | 主键 (UFID) |
| 22 | name_dept | 科室名称 | name_dept | varchar(50) |  | 字符串 (String) |
| 23 | norm_day | 标准住院天数 | norm_day | varchar(20) |  | 字符串 (String) |
| 24 | pk_cptype | 路径类型 | pk_cptype | varchar(20) |  | 路径类型(自定义档案) (Defdoc-060401) |
| 25 | dt_cptype | 路径类型码值 | dt_cptype | varchar(50) |  | 字符串 (String) |
| 26 | cpcode | 路径编码new | cpcode | varchar(50) |  | 字符串 (String) |
| 27 | cpname | 路径名称new | cpname | varchar(50) |  | 字符串 (String) |
| 28 | cpdes | 路径描述 | cpdes | varchar(256) |  | 字符串 (String) |
| 29 | pk_org_v | 所属组织机构版本 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 30 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 31 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 32 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 33 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |