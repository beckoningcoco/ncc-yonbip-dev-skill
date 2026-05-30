# |<<

**业务活动 (ssc_busiactivity / nc.vo.ssc.task.base.SSCBusiActVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5508.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busiactivity | 实体标识 | pk_busiactivity | char(20) | √ | 主键 (UFID) |
| 2 | displaycode | 编码 | displaycode | varchar(50) |  | 字符串 (String) |
| 3 | displayname | 名称 | displayname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | previousact | 前一个业务活动 | previousact | varchar(20) |  | 业务活动 (busiactivity) |