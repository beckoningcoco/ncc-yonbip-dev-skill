# |<<

**皮试记录 (uh_ex_ord_st / com.yonyou.yh.nhis.ex.mt.vo.ExMtOrdStVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6105.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_strec | 主键 | pk_strec | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_ordmt | 医疗执行 | pk_ordmt | varchar(20) |  | 医疗执行_医嘱_医技 (OrdMTApplyVO) |
| 5 | desc_ord | 医嘱内容 | desc_ord | varchar(4000) |  | 字符串 (String) |
| 6 | pk_org_st | 执行机构 | pk_org_st | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 7 | pk_ord | 医嘱 | pk_ord | varchar(50) |  | 字符串 (String) |
| 8 | pk_dept_st | 执行科室 | pk_dept_st | varchar(20) |  | 字符串 (String) |
| 9 | pk_psn_st | 操作人 | pk_psn_st | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | name_psn_st | 操作人姓名 | name_psn_st | varchar(50) |  | 字符串 (String) |
| 11 | date_st | 操作日期 | date_st | char(19) |  | 日期时间 (UFDateTime) |
| 12 | eu_result | 皮试阳性 | eu_result | int |  | 整数 (Integer) |
| 13 | flag_chk | 审核标志 | flag_chk | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 15 | batch_number | 批次号 | batch_number | varchar(30) |  | 字符串 (String) |
| 16 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 17 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 19 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |