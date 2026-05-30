# |<<

**质控主表 (cn_emr_qa / com.yonyou.yh.nhis.bd.ecd.vo.CNEmrQaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1593.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnemrqa | 质控主键 | pk_cnemrqa | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pi | 患者主键 | pk_pi | varchar(50) |  | 字符串 (String) |
| 5 | pk_pv | 就诊主键 | pk_pv | varchar(50) |  | 字符串 (String) |
| 6 | pk_dept_qa | 质控科室 | pk_dept_qa | varchar(20) |  | 组织_部门 (dept) |
| 7 | pk_psn_qa | 质控医师 | pk_psn_qa | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | date_qa | 质控时间 | date_qa | char(19) |  | 日期 (UFDate) |
| 9 | count | 质控次数 | count | int |  | 整数 (Integer) |
| 10 | score | 质控得分 | score | decimal(14, 2) |  | 数值 (UFDouble) |
| 11 | eu_qa_type | 质控类型 | eu_qa_type | int |  | 质控类型 (CNEmrQaTypeEnum) |  | 0=医生环节质控; |