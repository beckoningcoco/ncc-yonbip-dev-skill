# |<<

**公卫领域疾病发现管理 (bd_uh_ph_chro / com.yonyou.yh.nhis.bd.phchro.vo.PhChroVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1079.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_phchro | 疾病发现主键 | pk_phchro | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_chro | 慢病编码类型 | pk_chro | varchar(20) |  | 公卫领域疾病发现编码(自定义档案) (Defdoc-070012) |
| 5 | dt_chro | 慢病编码 | dt_chro | varchar(50) |  | 字符串 (String) |
| 6 | pk_ph | 公卫领域主键 | pk_ph | varchar(20) |  | 公卫领域定义 (phdomain) |
| 7 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |