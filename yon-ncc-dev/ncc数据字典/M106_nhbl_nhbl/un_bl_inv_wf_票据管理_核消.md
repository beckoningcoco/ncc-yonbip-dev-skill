# |<<

**票据管理_核消 (un_bl_inv_wf / com.yonyou.yh.nhis.bl.invc.vo.BlInvcWriteoffVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6305.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invwriteoff | 票据核消主键 | pk_invwriteoff | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | code_invwriteoff | 核销业务编码 | code_invwriteoff | varchar(50) |  | 字符串 (String) |
| 5 | name_invwriteoff | 核销业务名称 | name_invwriteoff | varchar(50) |  | 字符串 (String) |
| 6 | date_invwriteoff | 核销日期 | date_invwriteoff | char(19) |  | 日期时间 (UFDateTime) |
| 7 | pk_psn_invwriteoff | 核销人员 | pk_psn_invwriteoff | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | pk_psn_chk | 稽核人员 | pk_psn_chk | varchar(20) |  | 用户 (user) |
| 9 | date_chk | 稽核日期 | date_chk | char(19) |  | 日期时间 (UFDateTime) |
| 10 | eu_status | 核销状态 | eu_status | int |  | 核销状态 (invcwriteoffsta) |  | 0=核销; |