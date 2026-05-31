# |<<

**稽核任务 (sscqm_check_task / nccloud.vo.sscqm.qualityapi.vo.CheckTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5601.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | pk | id | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(100) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(500) |  | 字符串 (String) |
| 4 | sscorgid | 共享中心id | sscorgid | varchar(36) |  | 共享服务中心 (sscunit) |
| 5 | task_property | 任务属性 | task_property | varchar(50) |  | 字符串 (String) |
| 6 | task_status | 任务状态 | task_status | varchar(50) |  | 字符串 (String) |
| 7 | sample_rate | 抽样比例 | sample_rate | varchar(50) |  | 字符串 (String) |
| 8 | sample_size | 抽样数 | sample_size | int |  | 整数 (Integer) |
| 9 | sampleid | 抽样人 | sampleid | varchar(36) |  | 用户 (user) |
| 10 | confirmid | 确认人 | confirmid | varchar(36) |  | 用户 (user) |
| 11 | processor | 稽核人 | processor | varchar(36) |  | 用户 (user) |
| 12 | check_frequency | 质检频次 | check_frequency | varchar(50) |  | 字符串 (String) |
| 13 | start_time | 任务开始时间 | start_time | char(19) |  | 日期 (UFDate) |
| 14 | end_time | 任务结束时间 | end_time | char(19) |  | 日期 (UFDate) |
| 15 | creater | 创建人 | creater | varchar(36) |  | 用户 (user) |
| 16 | creat_time | 创建时间 | creat_time | char(19) |  | 日期 (UFDate) |
| 17 | remark | 备注 | remark | varchar(200) |  | 字符串 (String) |
| 18 | workinggroup | 关联工作组 | workinggroup | varchar(50) |  | 字符串 (String) |
| 19 | rectification | 整改过程 | rectification | varchar(50) |  | 整改过程 (RectificationEnum) |  | RECORD=记录; |