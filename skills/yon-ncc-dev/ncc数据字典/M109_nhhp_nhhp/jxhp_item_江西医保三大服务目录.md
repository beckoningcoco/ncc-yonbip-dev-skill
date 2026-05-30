# |<<

**江西医保三大服务目录 (jxhp_item / com.yonyou.yh.nhis.hp.jx.city.vo.JXHPItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3536.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpitem | 主键 | pk_hpitem | char(20) | √ | 主键 (UFID) |
| 2 | eu_itemtype | 目录类型 | eu_itemtype | int |  | 整数 (Integer) |
| 3 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 4 | code | 编码 | code | varchar(100) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(100) |  | 字符串 (String) |
| 6 | pay_cate | 医保支付类别 | pay_cate | varchar(100) |  | 字符串 (String) |
| 7 | bill_cate | 发票项目类别 | bill_cate | varchar(100) |  | 字符串 (String) |
| 8 | cname | 商品名称 | cname | varchar(100) |  | 字符串 (String) |
| 9 | ename | 英文名称 | ename | varchar(100) |  | 字符串 (String) |
| 10 | mnecode | 拼音助记码 | mnecode | varchar(100) |  | 字符串 (String) |
| 11 | dosageform | 剂型 | dosageform | varchar(100) |  | 字符串 (String) |
| 12 | spec | 规格 | spec | varchar(100) |  | 字符串 (String) |
| 13 | factory | 厂家 | factory | varchar(100) |  | 字符串 (String) |
| 14 | limit_price | 限定 | limit_price | varchar(1000) |  | 字符串 (String) |
| 15 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 16 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 17 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 21 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |