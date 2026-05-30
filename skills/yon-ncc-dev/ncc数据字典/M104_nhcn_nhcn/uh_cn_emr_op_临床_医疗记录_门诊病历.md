# |<<

**临床 医疗记录 门诊病历 (uh_cn_emr_op / com.yonyou.yh.nhis.cn.ecd.vo.CNEmrOpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6000.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrop | 医疗记录门诊病历主键 | pk_emrop | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_emr | 所属医疗记录 | pk_emr | varchar(50) |  | 字符串 (String) |
| 5 | eu_emrfptype | 门诊病历类型 | eu_emrfptype | int |  | 门诊病历类型 (EmrFpTypeEnum) |  | 0=西医; |