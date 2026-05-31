# |<<

**患者药品过敏史 (uh_pi_al / com.yonyou.yh.nhis.pi.ov.vo.PiOvAlVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6175.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patial | 患者过敏史主键 | pk_patial | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息ov (piovpativo) |
| 5 | mcsrc | 信息来源 | mcsrc | int |  | 整数 (Integer) |
| 6 | pk_mctype | 医疗术语类型 | pk_mctype | varchar(20) |  | 医疗术语类型(自定义档案) (Defdoc-060003) |
| 7 | dt_mctype | 医疗术语类型编码 | dt_mctype | varchar(50) |  | 字符串 (String) |
| 8 | pk_mc_al_pv | 过敏药物_就诊流程 | pk_mc_al_pv | varchar(20) |  | 基础医疗术语 (MCTermVO) |
| 9 | pk_mc_al_ehr | 过敏药物_健康档案 | pk_mc_al_ehr | varchar(20) |  | 基础医疗术语 (MCTermVO) |
| 10 | pk_mc_al_rhip | 过敏药物_区域平台 | pk_mc_al_rhip | varchar(20) |  | 基础医疗术语 (MCTermVO) |
| 11 | name_al | 过敏药物名称 | name_al | varchar(50) |  | 字符串 (String) |
| 12 | date_al | 发现日期 | date_al | char(19) |  | 日期时间 (UFDateTime) |
| 13 | date_entry | 登记日期 | date_entry | char(19) |  | 日期时间 (UFDateTime) |
| 14 | pk_psn | 登记人员 | pk_psn | varchar(20) |  | 人员基本信息 (psndoc) |