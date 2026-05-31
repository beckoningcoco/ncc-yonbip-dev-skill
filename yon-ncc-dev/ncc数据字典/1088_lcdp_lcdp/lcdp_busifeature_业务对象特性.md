# |<<

**业务对象特性 (lcdp_busifeature / nc.vo.lcdp.pub.feature.BusiFeatureVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3545.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busi | pk_busi | pk_busi | char(20) | √ | 主键 (UFID) |
| 2 | name | 特性名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | code | 特性编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | description | 描述 | description | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | ordernum | 执行顺序 | ordernum | int |  | 整数 (Integer) |
| 6 | sysfeature | 是否系统特性 | sysfeature | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | defaultfeature | 是否默认特性 | defaultfeature | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | sysserviceclass | 特性服务类 | sysserviceclass | varchar(100) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |