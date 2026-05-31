# |<<

**医保机构 (zzhp_org / com.yonyou.yh.nhis.hp.zz.vo.ZZHPOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6398.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hporg | 主键 | pk_hporg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_payer | 医保付款机构 | pk_payer | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | pk_org_hp | 医疗机构 | pk_org_hp | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 6 | code | 医疗机构编码 | code | varchar(30) |  | 字符串 (String) |
| 7 | name | 医疗机构名称 | name | varchar(50) |  | 字符串 (String) |
| 8 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |