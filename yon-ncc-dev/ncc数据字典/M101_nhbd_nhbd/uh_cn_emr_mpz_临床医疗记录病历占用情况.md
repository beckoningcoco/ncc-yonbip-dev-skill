# |<<

**临床医疗记录病历占用情况 (uh_cn_emr_mpz / com.yonyou.yh.nhis.bd.ecd.vo.CnEmrMpzVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5999.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnemrmpz | 病历占用记录主键 | pk_cnemrmpz | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_emrseccont | 医疗记录段落 | pk_emrseccont | varchar(20) |  | 临床_文档_段落 (uhCNEmrSec) |
| 5 | pk_psn_phy | 医生主键 | pk_psn_phy | varchar(20) |  | 人员基本信息 (psndoc) |
| 6 | name_psn_phy | 医生姓名 | name_psn_phy | varchar(50) |  | 字符串 (String) |
| 7 | opened_time | 打开时间 | opened_time | char(19) |  | 日期时间 (UFDateTime) |
| 8 | mod_name | 模块名称 | mod_name | varchar(4000) |  | 字符串 (String) |
| 9 | eu_applyto | 适用范围 | eu_applyto | int |  | 整数 (Integer) |
| 10 | ip_occupied | 占用IP | ip_occupied | varchar(50) |  | 字符串 (String) |
| 11 | server_url | 在线管理服务器地址 | server_url | varchar(100) |  | 字符串 (String) |
| 12 | sys_identification | 系统标识 | sys_identification | varchar(50) |  | 字符串 (String) |