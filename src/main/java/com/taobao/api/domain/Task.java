package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 批量异步任务结果
 *
 * @author auto create
 * @since 1.0, null
 */
public class Task extends TaobaoObject {

	private static final long serialVersionUID = 7122475788493322481L;

	/**
	 * 任务创建时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 大任务结果下载地址。当创建的认任务是大数据量的任务时，获取结果会返回此字段，同时subtasks列表会为空。
通过这个地址可以下载到结果的结构体，格式同普通任务下载的一样。
每次获取到的地址只能下载一次。下载的文件加上后缀名.zip打开。
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * 此任务是由哪个api产生的
	 */
	@ApiField("method")
	private String method;

	/**
	 * 异步任务处理状态。new（还未开始处理），doing（处理中），done（处理结束）。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 子任务处理结果，如果任务还没有处理完，返回的结果列表为空。如果任务处理完毕，返回子任务结果列表
	 */
	@ApiListField("subtasks")
	@ApiField("subtask")
	private List<Subtask> subtasks;

	/**
	 * 异步任务id。创建异步任务时返回的任务id号
	 */
	@ApiField("task_id")
	private Long taskId;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getMethod() {
		return this.method;
	}
	public void setMethod(String method) {
		this.method = method;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<Subtask> getSubtasks() {
		return this.subtasks;
	}
	public void setSubtasks(List<Subtask> subtasks) {
		this.subtasks = subtasks;
	}

	public Long getTaskId() {
		return this.taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

}
