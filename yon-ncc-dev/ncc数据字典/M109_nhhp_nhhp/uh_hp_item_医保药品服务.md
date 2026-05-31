# |<<

**医保药品服务 (uh_hp_item / com.yonyou.yh.nhis.hp.hp.vo.HpItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6121.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 2 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 3 | eu_hptype | 医保类别 | eu_hptype | varchar(20) |  | 医保计划 (healthplan) |
| 4 | eu_itemtype | 目录类型 | eu_itemtype | varchar(50) |  | 目录类型 (enum) |  | 0=药品; |