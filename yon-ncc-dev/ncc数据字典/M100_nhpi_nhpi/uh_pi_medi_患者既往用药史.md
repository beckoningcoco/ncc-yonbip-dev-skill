# |<<

**患者既往用药史 (uh_pi_medi / com.yonyou.yh.nhis.pi.ov.vo.PiOvMediVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6201.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patimedi | 患者用药既往史主键 | pk_patimedi | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息ov (piovpativo) |
| 5 | pk_mctype | 医疗术语类型 | pk_mctype | varchar(20) |  | 医疗术语类型(自定义档案) (Defdoc-060003) |
| 6 | dt_mctype | 医疗术语类型编码 | dt_mctype | varchar(50) |  | 字符串 (String) |
| 7 | mcsrc | 信息来源 | mcsrc | int |  | 整数 (Integer) |
| 8 | pk_mc_medi_pv | 药品_就诊流程 | pk_mc_medi_pv | varchar(20) |  | 基础医疗术语 (MCTermVO) |
| 9 | pk_mc_medi_ehr | 药品_健康档案 | pk_mc_medi_ehr | varchar(20) |  | 基础医疗术语 (MCTermVO) |
| 10 | pk_mc_medi_rhip | 药品_区域平台 | pk_mc_medi_rhip | varchar(20) |  | 基础医疗术语 (MCTermVO) |
| 11 | name_medi | 药品名称 | name_medi | varchar(50) |  | 字符串 (String) |
| 12 | desc_medi | 服用描述 | desc_medi | varchar(256) |  | 字符串 (String) |
| 13 | date_begin | 服用开始日期 | date_begin | char(19) |  | 日期时间 (UFDateTime) |
| 14 | date_end | 服用结束日期 | date_end | char(19) |  | 日期时间 (UFDateTime) |
| 15 | note_medi | 服用情况描述 | note_medi | varchar(256) |  | 字符串 (String) |
| 16 | date_entry | 登记日期 | date_entry | char(19) |  | 日期时间 (UFDateTime) |
| 17 | pk_psn | 登记人员 | pk_psn | varchar(20) |  | 人员基本信息 (psndoc) |