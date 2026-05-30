# |<<

**患者就诊_医疗组 (uh_pv_wg / com.yonyou.yh.nhis.pv.pativisitwg.vo.PatiVisitWgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6247.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvwg | 患者就诊医疗组主键 | pk_pvwg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pv | 患者就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 5 | pk_wg | 医疗组 | pk_wg | varchar(50) |  | 字符串 (String) |
| 6 | date_begin | 开始日期 | date_begin | char(19) |  | 日期时间 (UFDateTime) |
| 7 | date_end | 结束日期 | date_end | char(19) |  | 日期时间 (UFDateTime) |
| 8 | pk_patieva | 患者评价 | pk_patieva | varchar(20) |  | 患者评价等级(自定义档案) (Defdoc-000112) |
| 9 | dt_patieva | 患者评价编码 | dt_patieva | varchar(50) |  | 字符串 (String) |
| 10 | name_patieva | 患者评价描述 | name_patieva | varchar(256) |  | 字符串 (String) |
| 11 | pk_pvdept | 患者就诊科室 | pk_pvdept | char(20) |  | 主键 (UFID) |