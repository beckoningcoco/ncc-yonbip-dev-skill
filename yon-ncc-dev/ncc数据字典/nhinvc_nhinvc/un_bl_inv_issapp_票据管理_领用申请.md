# |<<

**票据管理_领用申请 (un_bl_inv_issapp / com.yonyou.yh.nhis.bl.invc.vo.BlInvcIssAppVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6300.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invissapp | 票据领用申请主键 | pk_invissapp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | appno | 申请单号 | appno | varchar(50) |  | 字符串 (String) |
| 5 | pk_dept_app | 申请科室 | pk_dept_app | varchar(20) | √ | 组织_部门 (dept) |
| 6 | pk_psn_app | 申请人 | pk_psn_app | varchar(20) | √ | 人员基本信息 (psndoc) |
| 7 | date_app | 申请日期 | date_app | char(19) | √ | 日期 (UFDate) |
| 8 | date_need | 需求日期 | date_need | char(19) | √ | 日期 (UFDate) |
| 9 | eu_appstatus | 申请单状态 | eu_appstatus | int |  | 票据领用申请单状态 (blappstatus) | 0 | 0=保存; |