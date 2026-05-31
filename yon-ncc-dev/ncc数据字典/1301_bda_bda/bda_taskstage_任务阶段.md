# |<<

**任务阶段 (bda_taskstage / uap.vo.bda.ap.task.entity.StageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1170.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stage | 阶段主键 | pk_stage | char(20) | √ | 主键 (UFID) |
| 2 | processor | 处理器 | processor | varchar(50) |  | 字符串 (String) |
| 3 | stagestatus | 阶段状态 | stagestatus | int |  | 任务状态 (TaskStatus) |  | 1=初始; |