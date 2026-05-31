# |<<

**暴露方式 (uh_oc_expose_report_em / com.yonyou.yh.nhis.cn.hims.vo.OcExposeReportEmVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6135.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_oc_expose_report_em | 暴露方式主键 | pk_oc_expose_report_em | char(20) | √ | 主键 (UFID) |
| 2 | eu_type | 暴露方式 | eu_type | varchar(50) |  | 字符串 (String) |
| 3 | mucous | 黏膜 | mucous | varchar(50) |  | 字符串 (String) |
| 4 | mucous_other | 黏膜其他 | mucous_other | varchar(50) |  | 字符串 (String) |
| 5 | skin | 皮肤 | skin | varchar(50) |  | 字符串 (String) |
| 6 | contact_area | 接触面积 | contact_area | varchar(50) |  | 字符串 (String) |
| 7 | date_contact | 接触时间 | date_contact | varchar(50) |  | 字符串 (String) |
| 8 | contact_material | 接触物质 | contact_material | varchar(50) |  | 字符串 (String) |
| 9 | contact_material_other | 接触物质其它 | contact_material_other | varchar(50) |  | 字符串 (String) |
| 10 | exposure | 接触量 | exposure | varchar(50) |  | 字符串 (String) |
| 11 | contaminant_exposure | 污染物接触 | contaminant_exposure | varchar(50) |  | 字符串 (String) |
| 12 | pk_device_type | 器械类型主键 | pk_device_type | char(20) |  | 主键 (UFID) |
| 13 | dt_device_type | 器械类型 | dt_device_type | varchar(50) |  | 字符串 (String) |
| 14 | pk_injury_risk | 损伤危险度主键 | pk_injury_risk | char(20) |  | 主键 (UFID) |
| 15 | dt_injury_risk | 损伤危险度 | dt_injury_risk | varchar(50) |  | 字符串 (String) |
| 16 | pk_pollutants_source | 污染物来源主键 | pk_pollutants_source | char(20) |  | 主键 (UFID) |
| 17 | dt_pollutants_source | 污染物来源 | dt_pollutants_source | varchar(50) |  | 字符串 (String) |
| 18 | pk_injury_site | 损伤部位主键 | pk_injury_site | char(20) |  | 主键 (UFID) |
| 19 | dt_injury_site | 损伤部位 | dt_injury_site | varchar(50) |  | 字符串 (String) |
| 20 | pk_wear_gloves | 暴露时是否戴手套主键 | pk_wear_gloves | char(20) |  | 主键 (UFID) |
| 21 | dt_wear_gloves | 暴露时是否戴手套 | dt_wear_gloves | varchar(50) |  | 字符串 (String) |
| 22 | pk_mode_injury | 致伤方式主键 | pk_mode_injury | char(20) |  | 主键 (UFID) |
| 23 | dt_mode_injury | 致伤方式 | dt_mode_injury | varchar(50) |  | 字符串 (String) |
| 24 | pk_damage_bleed | 破损出血主键 | pk_damage_bleed | char(20) |  | 主键 (UFID) |
| 25 | dt_damage_bleed | 破损出血 | dt_damage_bleed | varchar(50) |  | 字符串 (String) |
| 26 | assoper | 关联操作 | assoper | varchar(50) |  | 字符串 (String) |
| 27 | assoper_other | 关联操作其他 | assoper_other | varchar(50) |  | 字符串 (String) |
| 28 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 29 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 30 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 31 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 32 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 33 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 34 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 35 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 36 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |