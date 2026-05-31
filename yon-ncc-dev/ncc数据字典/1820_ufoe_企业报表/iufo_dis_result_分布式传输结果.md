# |<<

**分布式传输结果 (iufo_dis_result / nc.vo.iufo.distribute.DisTransLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3415.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_item | 传输结果主键 | pk_item | char(20) | √ | 主键 (UFID) |
| 2 | itemdesc | 传输资源描述 | itemdesc | varchar(200) |  | 字符串 (String) |
| 3 | pk_task | 采集任务/合并方案 | pk_task | varchar(20) |  | 任务 (task) |
| 4 | senderid | 发送方 | senderid | varchar(50) | √ | 字符串 (String) |
| 5 | receiverid | 接收方 | receiverid | varchar(50) | √ | 字符串 (String) |
| 6 | restype | 传输资源类型 | restype | varchar(50) |  | 传输资源类型 (transrestype) |  | key=关键字; |