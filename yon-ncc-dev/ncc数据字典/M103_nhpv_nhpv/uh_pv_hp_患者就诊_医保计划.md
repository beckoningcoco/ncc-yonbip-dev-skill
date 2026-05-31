# |<<

**患者就诊_医保计划 (uh_pv_hp / com.yonyou.yh.nhis.pv.pvbanner.vo.PvBannerHpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6227.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pv_hp | 患者就诊医保计划主键 | pk_pv_hp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 5 | pk_hp | 保险计划_本次就诊 | pk_hp | varchar(20) |  | 医保计划 (healthplan) |
| 6 | flag_maj | 主医保计划标识 | flag_maj | char(1) |  | 布尔类型 (UFBoolean) |