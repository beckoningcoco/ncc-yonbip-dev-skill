# |<<

**计算规则分类 (bi_calc_dir / nc.vo.bi.calc.CalcRuleDirVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1189.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | guid | 分类 | guid | char(20) | √ | 主键 (UFID) |
| 2 | dirname | 名称 | dirname | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | pguid | 上级分类 | pguid | varchar(20) |  | 计算规则分类 (calcruledir) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | creator | 创建者 | creator | varchar(20) |  | 用户 (user) |
| 7 | modifier | 修改者 | modifier | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |