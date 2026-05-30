# |<<

**集团同步传输资源 (org_groupsynctrans / nc.vo.org.distribution.GroupSyncTransResVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4075.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_synctrans | 资源主键 | pk_synctrans | char(20) | √ | 主键 (UFID) |
| 2 | code | 资源编码 | code | varchar(40) |  | 字符串 (String) |
| 3 | creatorclass | 资源创建类路径 | creatorclass | varchar(200) |  | 字符串 (String) |
| 4 | processclass | 资源处理类路径 | processclass | varchar(200) |  | 字符串 (String) |
| 5 | receiptclass | 资源回执处理类路径 | receiptclass | varchar(200) |  | 字符串 (String) |
| 6 | memo | 说明 | memo | varchar(200) |  | 字符串 (String) |