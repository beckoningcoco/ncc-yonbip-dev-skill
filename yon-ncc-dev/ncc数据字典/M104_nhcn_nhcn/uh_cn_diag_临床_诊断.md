# |<<

**临床_诊断 (uh_cn_diag / com.yonyou.yh.nhis.cn.ord.v2.vo.CNDiagVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5989.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cndiag | 对应临床诊断 | pk_cndiag | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_pati | 患者 | pk_pati | varchar(50) |  | 字符串 (String) |
| 5 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(50) |  | 字符串 (String) |
| 6 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(30) |  | 字符串 (String) |
| 7 | pk_pv | 患者就诊 | pk_pv | varchar(50) |  | 字符串 (String) |
| 8 | desc_diags | 本次诊断描述串 | desc_diags | varchar(256) |  | 字符串 (String) |
| 9 | date_diag | 诊断日期 | date_diag | char(19) |  | 日期时间 (UFDateTime) |
| 10 | dt_diagtype | 诊断类型 | dt_diagtype | varchar(50) |  | 字符串 (String) |
| 11 | name_psn_phy | 诊断医生名称 | name_psn_phy | varchar(50) |  | 字符串 (String) |
| 12 | pk_psn_phy | 诊断医生 | pk_psn_phy | varchar(50) |  | 字符串 (String) |
| 13 | pk_cnet | 临床事件 | pk_cnet | varchar(50) |  | 字符串 (String) |
| 14 | note | 备注 | note | varchar(256) |  | 字符串 (String) |