# |<<

**队列管理_工作点定义 (bd_uh_que_site / nc.vo.nhbd.wf.UhBDQueSiteVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1099.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_quesite | 队列工作点主键 | pk_quesite | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_pc | 对应计算机工作站 | pk_pc | varchar(20) |  | 计算机工作站定义 (uhpc) |
| 5 | quan_apply | 工作点申请量 | quan_apply | int |  | 整数 (Integer) |
| 6 | addr_board | 对应屏幕地址 | addr_board | varchar(256) |  | 字符串 (String) |
| 7 | flag_pause | 暂停标志 | flag_pause | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | datetime_begin | 有效开始日期时间_暂停作用域 | datetime_begin | char(19) |  | 日期 (UFDate) |
| 9 | datetime_end | 有效结束日期时间_暂停作用域 | datetime_end | char(19) |  | 日期 (UFDate) |
| 10 | eu_role | 队列用途 | eu_role | int |  | 队列用途 (enum) |  | 1=配药队列; |