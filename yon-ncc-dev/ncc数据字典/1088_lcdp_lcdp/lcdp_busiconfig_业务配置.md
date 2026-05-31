# |<<

**业务配置 (lcdp_busiconfig / nc.vo.lcdp.pub.feature.BusiConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3544.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busiconfig | 主键 | pk_busiconfig | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | configaddr | 配置地址 | configaddr | varchar(50) |  | 字符串 (String) |
| 5 | ordernum | 显示顺序 | ordernum | int |  | 整数 (Integer) |