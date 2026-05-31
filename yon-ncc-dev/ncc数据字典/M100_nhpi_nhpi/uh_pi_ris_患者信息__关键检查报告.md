# |<<

**患者信息_ 关键检查报告 (uh_pi_ris / com.yonyou.yh.nhis.pi.ov.vo.PiOvRisVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6204.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patiris | 患者检查主键 | pk_patiris | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息ov (piovpativo) |
| 5 | mcsrc | 信息来源 | mcsrc | int |  | 整数 (Integer) |
| 6 | pk_mctype | 医疗术语类型 | pk_mctype | varchar(20) |  | 医疗术语类型(自定义档案) (Defdoc-060003) |
| 7 | dt_mctype | 医疗术语类型编码 | dt_mctype | varchar(50) |  | 字符串 (String) |
| 8 | pk_mc_ris_pv | 检查_就诊流程 | pk_mc_ris_pv | varchar(20) |  | 基础医疗术语 (MCTermVO) |
| 9 | pk_mc_ris_ehr | 检查_健康档案 | pk_mc_ris_ehr | varchar(20) |  | 基础医疗术语 (MCTermVO) |
| 10 | pk_mc_ris_rhip | 检查_区域平台 | pk_mc_ris_rhip | varchar(20) |  | 基础医疗术语 (MCTermVO) |
| 11 | name_ris | 检查名称 | name_ris | varchar(500) |  | 字符串 (String) |
| 12 | result_ris | 检查诊断 | result_ris | varchar(4000) |  | 字符串 (String) |
| 13 | date_ris | 检查日期 | date_ris | char(19) |  | 日期时间 (UFDateTime) |