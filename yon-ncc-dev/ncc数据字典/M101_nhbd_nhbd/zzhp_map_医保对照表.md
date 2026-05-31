# |<<

**医保对照表 (zzhp_map / com.yonyou.yh.nhis.bd.tpi.hpcontrast.vo.ZZHPMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6397.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpmap | 主键 | pk_hpmap | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | eu_hptype | 医保类别 | eu_hptype | varchar(20) |  | 医保计划 (healthplan) |
| 5 | eu_itemtype | 目录类型 | eu_itemtype | int |  | 目录类型 (enum) |  | 0=药品; |