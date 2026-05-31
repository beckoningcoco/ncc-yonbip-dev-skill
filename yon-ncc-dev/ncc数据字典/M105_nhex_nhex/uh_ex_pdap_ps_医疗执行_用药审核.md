# |<<

**医疗执行_用药审核 (uh_ex_pdap_ps / com.yonyou.yh.nhis.ex.sdc.vo.ExPdPsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6109.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdps | 用药审核 | pk_pdps | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_dept_ap | 申请部门 | pk_dept_ap | varchar(20) |  | 组织_部门 (dept) |
| 5 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 6 | pk_pv | 就诊 | pk_pv | varchar(20) |  | 患者就诊 (pvbanner) |
| 7 | pk_ord | 医嘱 | pk_ord | varchar(50) |  | 字符串 (String) |
| 8 | desc_ord | 医嘱内容 | desc_ord | varchar(50) |  | 字符串 (String) |
| 9 | dt_usage | 医嘱用法 | dt_usage | varchar(50) |  | 字符串 (String) |
| 10 | dt_usagenote | 医嘱要求 | dt_usagenote | varchar(50) |  | 字符串 (String) |
| 11 | pk_freq | 医嘱频次 | pk_freq | varchar(20) |  | 医嘱频次 (OrdFreqVO) |
| 12 | scr_auto | 自动审核结果 | scr_auto | int |  | 自动审核结果 (enum) |  | 0=正常; |