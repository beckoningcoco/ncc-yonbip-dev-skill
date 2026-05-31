# |<<

**物品存储_调价 (uh_pd_st_pa / com.yonyou.yh.nhis.scm.uhpd.vo.UhPdStPaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6154.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdpa | 物品调价主键 | pk_pdpa | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | dt_pdpatype | 调价类型类型 | dt_pdpatype | varchar(50) |  | 字符串 (String) |
| 5 | code | 调价编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 调价名称 | name | varchar(50) |  | 字符串 (String) |
| 7 | date_pa | 调价生效日期 | date_pa | char(19) |  | 日期时间 (UFDateTime) |
| 8 | pk_psn_pa | 调价人员 | pk_psn_pa | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | flag_chk | 审核标志 | flag_chk | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | pk_psn_chk | 审核人员 | pk_psn_chk | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | date_chk | 审核日期 | date_chk | char(19) |  | 日期时间 (UFDateTime) |
| 12 | eu_status | 调价状态 | eu_status | int |  | 整数 (Integer) |
| 13 | date_entry | 输入日期 | date_entry | char(19) |  | 日期时间 (UFDateTime) |
| 14 | flag_active | 有效标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | note | 备注 | note | varchar(50) |  | 字符串 (String) |