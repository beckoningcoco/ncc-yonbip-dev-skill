# |<<

**票据领用 (uh_bl_inv_iss / com.yonyou.yh.nhis.bl.invc.vo.BlInvcissDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5933.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inviss | 领用主键 | pk_inviss | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |
| 5 | code_iss | 票据领用编码 | code_iss | varchar(50) |  | 字符串 (String) |
| 6 | name_iss | 票据领用名称 | name_iss | varchar(50) |  | 字符串 (String) |
| 7 | pk_dept_entry | 录入部门 | pk_dept_entry | varchar(20) |  | 组织_部门 (dept) |
| 8 | pk_psn_entry | 录入人员 | pk_psn_entry | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | date_entry | 录入日期 | date_entry | char(19) |  | 日期 (UFDate) |
| 10 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 11 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 15 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |