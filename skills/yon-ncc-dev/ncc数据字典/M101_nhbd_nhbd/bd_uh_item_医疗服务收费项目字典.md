# |<<

**医疗服务收费项目字典 (bd_uh_item / com.yonyou.nhis.bd.pub2.item.vo.ItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1050.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_item | 项目主键 | pk_item | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 7 | wbcode | 五笔码 | wbcode | varchar(50) |  | 字符串 (String) |
| 8 | othcode | 其他码 | othcode | varchar(50) |  | 字符串 (String) |
| 9 | pk_measdoc | 单位 | pk_measdoc | char(20) |  | 主键 (UFID) |
| 10 | spec | 规格 | spec | varchar(50) |  | 字符串 (String) |
| 11 | pk_price | 定价模式 | pk_price | char(20) |  | 主键 (UFID) |
| 12 | flag_set | 组套标志 | flag_set | varchar(50) |  | 字符串 (String) |
| 13 | price | 参考价格 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | price_a | 参考价格A | price_a | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | price_b | 参考价格B | price_b | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | flag_active | 启用标志 | flag_active | varchar(50) |  | 字符串 (String) |
| 17 | pk_srvcate | 服务分类 | pk_srvcate | char(20) |  | 主键 (UFID) |
| 18 | pk_chcate | 病案分类 | pk_chcate | char(20) |  | 主键 (UFID) |
| 19 | pk_opvoice | 门诊账单分类 | pk_opvoice | char(20) |  | 主键 (UFID) |
| 20 | pk_ipvoice | 住院账单分类 | pk_ipvoice | char(20) |  | 主键 (UFID) |
| 21 | note | 医疗项目说明 | note | varchar(50) |  | 字符串 (String) |
| 22 | flag_pd | 物品标志 | flag_pd | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | pk_material | 物料主键 | pk_material | char(20) |  | 主键 (UFID) |
| 24 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 25 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 26 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 27 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 28 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 29 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 30 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 31 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 32 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 33 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 34 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 35 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 36 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 37 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |