# |<<

**智能派单日志 (ssctp_intellidispatchlog / nccloud.vo.ssctp.intellidispatch.intellidispatchlog.IntellidispatchlogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5649.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intellidispatchlog | 主键 | pk_intellidispatchlog | char(20) | √ | 主键 (UFID) |
| 2 | pk_sscunit | 共享中心 | pk_sscunit | varchar(20) |  | 共享服务中心 (sscunit) |
| 3 | pk_workinggroup | 作业组 | pk_workinggroup | varchar(20) |  | 共享作业组 (ssctp_workinggroup) |
| 4 | pk_currenttask | 作业任务 | pk_currenttask | varchar(20) |  | 字符串 (String) |
| 5 | pk_sscnode | 共享环节 | pk_sscnode | varchar(20) |  | 字符串 (String) |
| 6 | pk_sscuser | 作业组用户 | pk_sscuser | varchar(20) |  | 用户 (user) |
| 7 | content | 派单上下文 | content | text(0) |  | 图片类型 (IMAGE) |
| 8 | dispatchstatus | 派单结果 | dispatchstatus | varchar(50) |  | 派单结果 (dispatchstatus) |  | success=派单成功; |