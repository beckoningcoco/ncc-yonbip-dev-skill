# |<<

**门诊病例模板 (bd_opmr_temp / com.yonyou.yh.nhis.bd.opmr.vo.OpEmrTempVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/918.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_opmrtemp | 门诊病历模板主键 | pk_opmrtemp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code | 模板编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 模板名称 | name | varchar(50) |  | 字符串 (String) |
| 6 | mnecode | 输入码 | mnecode | varchar(50) |  | 字符串 (String) |
| 7 | pk_dept_use | 使用科室 | pk_dept_use | varchar(20) |  | 组织_部门 (dept) |
| 8 | pk_psn_use | 使用人员 | pk_psn_use | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | pk_diag | 适用疾病 | pk_diag | varchar(50) |  | 字符串 (String) |
| 10 | problem | 主诉 | problem | varchar(200) |  | 备注 (Memo) |
| 11 | history | 既往史 | history | varchar(200) |  | 备注 (Memo) |
| 12 | exam_phy | 体格检查 | exam_phy | varchar(200) |  | 备注 (Memo) |
| 13 | exam_aux | 辅助检查 | exam_aux | varchar(200) |  | 换算率 (ConversionRate) |
| 14 | note | 备注 | note | varchar(200) |  | 备注 (Memo) |
| 15 | pk_org_create | 制作机构 | pk_org_create | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 16 | date_create | 制作日期 | date_create | char(19) |  | 日期时间 (UFDateTime) |
| 17 | pk_dept_create | 制作部门 | pk_dept_create | varchar(20) |  | 组织_部门 (dept) |
| 18 | pk_psn_create | 制作人员 | pk_psn_create | varchar(20) |  | 人员基本信息 (psndoc) |
| 19 | flag_active | 启动标识 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | allergy | 过敏史 | allergy | varchar(200) |  | 备注 (Memo) |
| 21 | pk_tempcate | 所属模板分类 | pk_tempcate | varchar(20) |  | 门诊病历模板分类 (OpEmrTempcateVO) |