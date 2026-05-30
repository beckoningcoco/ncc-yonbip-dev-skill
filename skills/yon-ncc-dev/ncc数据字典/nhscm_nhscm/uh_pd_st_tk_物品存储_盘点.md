# |<<

**物品存储_盘点 (uh_pd_st_tk / com.yonyou.yh.nhis.scm.uhpd.vo.UhPdSttkVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6157.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdtk | 物品盘点主键 | pk_pdtk | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | dt_pdtktype | 盘点类型 | dt_pdtktype | varchar(50) |  | 字符串 (String) |
| 5 | code | 盘点编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 盘点名称 | name | varchar(50) |  | 字符串 (String) |
| 7 | pk_stordoc_tk | 仓库 | pk_stordoc_tk | varchar(50) |  | 字符串 (String) |
| 8 | pk_dept_tk | 盘点库存部门 | pk_dept_tk | varchar(20) |  | 组织_部门 (dept) |
| 9 | date_tk | 盘点日期 | date_tk | char(19) |  | 日期时间 (UFDateTime) |
| 10 | pk_psn_tk | 盘点人员 | pk_psn_tk | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | pk_psn_chk | 审核人员 | pk_psn_chk | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | date_chk | 审核日期 | date_chk | char(19) |  | 日期时间 (UFDateTime) |
| 13 | eu_status | 盘点状态 | eu_status | int |  | 整数 (Integer) |
| 14 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 15 | def1 | 自定义字段1 | def1 | varchar(50) |  | 字符串 (String) |
| 16 | def2 | 自定义字段2 | def2 | varchar(50) |  | 字符串 (String) |
| 17 | def3 | 自定义字段3 | def3 | varchar(50) |  | 字符串 (String) |
| 18 | def4 | 自定义字段4 | def4 | varchar(50) |  | 字符串 (String) |
| 19 | def5 | 自定义字段5 | def5 | varchar(50) |  | 字符串 (String) |
| 20 | def6 | 自定义字段6 | def6 | varchar(50) |  | 字符串 (String) |
| 21 | def7 | 自定义字段7 | def7 | varchar(50) |  | 字符串 (String) |
| 22 | def8 | 自定义字段8 | def8 | varchar(50) |  | 字符串 (String) |
| 23 | def9 | 自定义字段9 | def9 | varchar(50) |  | 字符串 (String) |
| 24 | def10 | 自定义字段10 | def10 | varchar(50) |  | 字符串 (String) |
| 25 | def11 | 自定义字段11 | def11 | varchar(50) |  | 字符串 (String) |
| 26 | def12 | 自定义字段12 | def12 | varchar(50) |  | 字符串 (String) |
| 27 | def13 | 自定义字段13 | def13 | varchar(50) |  | 字符串 (String) |
| 28 | def14 | 自定义字段14 | def14 | varchar(50) |  | 字符串 (String) |
| 29 | def15 | 自定义字段15 | def15 | varchar(50) |  | 字符串 (String) |
| 30 | def16 | 自定义字段16 | def16 | varchar(50) |  | 字符串 (String) |
| 31 | def17 | 自定义字段17 | def17 | varchar(50) |  | 字符串 (String) |
| 32 | def18 | 自定义字段18 | def18 | varchar(50) |  | 字符串 (String) |
| 33 | def19 | 自定义字段19 | def19 | varchar(50) |  | 字符串 (String) |
| 34 | def20 | 自定义字段20 | def20 | varchar(50) |  | 字符串 (String) |
| 35 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 36 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 37 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 38 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |